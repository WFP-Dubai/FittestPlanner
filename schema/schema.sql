create table countries (
    countryid bigserial    primary key,
    iso	      varchar(2)   not null unique,
    fullname  varchar(200) not null unique,
    region    varchar(200) default ''
);

create table profiletypes (
    profiletypeid bigserial    primary key,
    profiletype   varchar(200) not null unique
);

create table stafftypes (
    stafftypeid bigserial    primary key,
    stafftype   varchar(200) not null unique
);

create table staff (
    staffindex     integer      primary key,
    firstname      varchar(256) not null,
    lastname       varchar(256) not null,
    dateofbirth    date,
    title          varchar(256) default '',
    thuraya        varchar(50)  default '',
    mobile         varchar(50)  default '',
    stafftypeid    bigserial,
    staffcolorcode varchar(100) default '',
    foreign key (stafftypeid) references stafftypes(stafftypeid)
        on delete restrict
);

-- Join with staff table to get staff's nationalities
create table staff_nationality_mapping (
    staffindex  integer,
    countryid   bigserial,
    primary key (staffindex, countryid),
    foreign key (staffindex) references staff(staffindex)
        on delete cascade,
    foreign key (countryid) references countries(countryid)
        on delete cascade
);

-- Join with staff table to get staff's profiles
create table staff_profiletype_mapping (
    staffindex    integer,
    profiletypeid bigserial,
    primary key (staffindex, profiletypeid),
    foreign key (staffindex) references staff(staffindex)
        on delete cascade,
    foreign key (profiletypeid) references profiletypes(profiletypeid)
        on delete cascade
);

create table activitytypes (
    activitytypeid        bigserial    primary key,
    activitytype          text         not null unique,
    activitytypecolorcode varchar(100) default ''
);

create table confirmedtypes (
    confirmedtypeid    bigserial    primary key,
    confirmedtype      varchar(100) default 'Not Confirmed',
    confirmedcolorcode varchar(100) default 'C20000'
);

create table activities (
    activityid              bigserial    primary key,
    activitydescription     text         default '',
    activitytypeid          bigserial,
    activityetcservicemap   varchar(256) default '',
    activityconfirmedtypeid bigserial,
    foreign key (activitytypeid) references activitytypes(activitytypeid)
        on delete restrict,
    foreign key (activityconfirmedtypeid) references confirmedtypes(confirmedtypeid)
        on delete restrict
);

create table activity_country_mapping (
    activityid  bigserial,
    countryid   bigserial,
    primary key (activityid, countryid),
    foreign key (activityid) references activities(activityid)
        on delete cascade,
    foreign key (countryid) references countries(countryid)
        on delete cascade
);

create table events (
    eventid        bigserial    primary key,
    event          varchar(256) not null,
    eventstartdate timestamp    default current_timestamp,
    eventenddate   timestamp    default current_timestamp,
    eventcolorcode varchar(100) default ''
);

create table languages (
    languageid bigserial    primary key,
    language   varchar(200) not null unique
);

-- Join with staff table to get staff's languages
create table staff_language_mapping (
    staffindex  integer,
    languageid  bigserial,
    primary key (staffindex, languageid),
    foreign key (staffindex) references staff(staffindex)
        on delete cascade,
    foreign key (languageid) references languages(languageid)
        on delete cascade
);

create table activityroles (
    activityroleid        bigserial     primary key,
    activityid            bigserial,
    profiletypeid         bigserial,
    activityrolestartdate timestamp     default current_timestamp,
    activityroleenddate   timestamp     default current_timestamp,
    activityrolelocation  varchar(200)  default '',
    foreign key (activityid) references activities(activityid)
        on delete cascade,
    foreign key (profiletypeid) references profiletypes(profiletypeid)
        on delete restrict
);

create table staffroles (
    staffroleid          bigserial     primary key,
    staffrolestartdate   timestamp     default current_timestamp,
    staffroleenddate     timestamp     default current_timestamp,
    staffrolelocation    varchar(200),
    staffrolecomments    text          default '',
    staffconfirmedtypeid bigserial,
    foreign key (staffconfirmedtypeid) references confirmedtypes(confirmedtypeid)
        on delete restrict
);

-- Join with staff role to get activity roles
create table staffrole_activityrole_mapping (
    staffroleid    bigserial,
    activityroleid bigserial,
    primary key (staffroleid, activityroleid),
    foreign key (staffroleid) references staffroles(staffroleid)
        on delete cascade,
    foreign key (activityroleid) references activityroles(activityroleid)
        on delete cascade
);

-- Join with staff to get staff roles
create table staff_staffrole_mapping (
    staffindex  bigserial,
    staffroleid bigserial,
    primary key (staffindex, staffroleid),
    foreign key (staffindex) references staff(staffindex)
        on delete cascade,
    foreign key (staffroleid) references staffroles(staffroleid)
        on delete cascade
);

create table operationtypes (
    operationtypeid bigserial   primary key,
    operationname   varchar(50) not null unique
);

create table audittable (
    auditid         bigserial    primary key,
    changedtime     timestamp    default current_timestamp,
    userid          varchar(100),
    tablename       varchar(50),
    operationtypeid bigserial,
    oldvalue        text         default '',
    newvalue        text         default '',
    ipaddress       varchar(256) not null,
    foreign key (operationtypeid) references operationtypes(operationtypeid)
        on delete restrict
);

--------------------------------------------------------------------------------
-- Views
--------------------------------------------------------------------------------

create view activity_staff_view
as
    select a.activityid, s.staffindex, a.activitytypeid from activities a
    inner join activityroles ar
        on a.activityid = ar.activityid
    inner join staffrole_activityrole_mapping sam
        on ar.activityroleid = sam.activityroleid
    inner join staff_staffrole_mapping ssrm
        on sam.staffroleid = ssrm.staffroleid
    inner join staff s
        on ssrm.staffindex = s.staffindex
;