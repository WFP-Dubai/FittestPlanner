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
    dateofbirth    date         not null,
    title          varchar(256) default '',
    thuraya        varchar(50)  default '',
    mobile         varchar(50)  default '',
    stafftype      bigserial,
    staffcolorcode varchar(100) default '',
    foreign key (stafftype) references stafftypes(stafftypeid)
);

-- Join with staff table to get staff's nationalities
create table staff_nationality_mapping (
    staffindex  integer,
    countryid   bigserial,
    primary key (staffindex, countryid),
    foreign key (staffindex) references staff(staffindex),
    foreign key (countryid) references countries(countryid)
);

-- Join with staff table to get staff's profiles
create table staff_profiletype_mapping (
    staffindex    integer,
    profiletypeid bigserial,
    primary key (staffindex, profiletypeid),
    foreign key (staffindex) references staff(staffindex),
    foreign key (profiletypeid) references profiletypes(profiletypeid)
);

create table activitytypes (
    activitytypeid bigserial    primary key,
    activitytype   text         not null unique,
    colorcode      varchar(100) default ''
);

create table activities (
    activityid     bigserial    primary key,
    description    text         default '',
    activitytypeid bigserial,
    etcservicemap  varchar(256) default '',
    foreign key (activitytypeid) references activitytypes(activitytypeid)
);

create table activity_country_mapping (
    activityid  bigserial,
    countryid   bigserial,
    primary key (activityid, countryid),
    foreign key (activityid) references activities(activityid),
    foreign key (countryid) references countries(countryid)
);

create table events (
    eventid   bigserial    primary key,
    event     varchar(256) not null,
    startdate timestamp    default current_timestamp,
    enddate   timestamp    default current_timestamp,
    colorcode varchar(100) default ''
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
    foreign key (staffindex) references staff(staffindex),
    foreign key (languageid) references languages(languageid)
);

create table staffconfirmedtypes (
    staffconfirmedtypeid bigserial primary key,
    staffconfirmedtype   varchar(100) not null unique
);

create table activityroles (
    activityroleid bigserial     primary key,
    activityid     bigserial,
    startdate      timestamp     default current_timestamp,
    enddate        timestamp     default current_timestamp,
    location       varchar(200)  default '',
    foreign key (activityid) references activities(activityid)
);

create table staffroles (
    staffroleid          bigserial     primary key,
    startdate            timestamp     default current_timestamp,
    enddate              timestamp     default current_timestamp,
    location             varchar(200),
    comments             text          default '',
    staffconfirmedtypeid bigserial,
    foreign key (staffconfirmedtypeid) references staffconfirmedtypes(staffconfirmedtypeid)
);

-- Join with staff role to get activity roles
create table staffrole_activityrole_mapping (
    staffroleid    bigserial,
    activityroleid bigserial,
    primary key (staffroleid, activityroleid),
    foreign key (staffroleid) references staffroles(staffroleid),
    foreign key (activityroleid) references activityroles(activityroleid)
);

-- Join with staff to get staff roles
create table staff_staffrole_mapping (
    staffindex  bigserial,
    staffroleid bigserial,
    primary key (staffindex, staffroleid),
    foreign key (staffindex) references staff(staffindex),
    foreign key (staffroleid) references staffroles(staffroleid)
);

create table missiontypes (
    missiontypeid bigserial    primary key,
    missiontype   varchar(100) not null unique
);

create table missions (
    missionid     bigserial    primary key,
    missionname   varchar(256) not null,
    missiontypeid bigserial,
    location    varchar(200) not null,
    description text         default '',
    startdate   timestamp    default current_timestamp,
    enddate     timestamp    default current_timestamp,
    foreign key (missiontypeid) references missiontypes(missiontypeid)
);

-- Join with mission table to get a mission's activities
create table mission_activity_mapping (
    missionid bigserial,
    activityid  bigserial,
    primary key (missionid, activityid),
    foreign key (missionid) references missions(missionid),
    foreign key (activityid) references activities(activityid)
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
);
