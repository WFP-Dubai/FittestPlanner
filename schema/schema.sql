create table countries (
    iso	     varchar(2)   primary key,
    fullname varchar(200) not null,
    region   varchar(200) default ''
);

create table profiletypes (
    profiletype  varchar(200) primary key
);

create table stafftypes (
    stafftype varchar(200) primary key
);

create table staff (
    index          integer      primary key,
    firstname      varchar(256) not null,
    lastname       varchar(256) not null,
    dateofbirth    date         not null,
    title          varchar(256) default '',
    profiletype    varchar(200),
    thuraya        varchar(50)  default '',
    mobile         varchar(50)  default '',
    stafftype      varchar(200),
    staffcolorcode varchar(100) default '',

    foreign key (profiletype) references profiletypes(profiletype),
    foreign key (stafftype) references stafftypes(stafftype)
);

-- Join with staff table to get staff's nationalities
create table staff_nationality_mapping (
    staffindex  integer,
    country     varchar(2),
    primary key (staffindex, country),
    foreign key (staffindex) references staff(index),
    foreign key (country) references countries(iso)
);

-- Join with staff table to get staff's profiles
create table staff_profiletype_mapping (
    staffindex  integer,
    profiletype varchar(200),
    primary key (staffindex, profiletype),
    foreign key (staffindex) references staff(index),
    foreign key (profiletype) references profiletypes(profiletype)
);

create table activitytypes (
    activitytype  text         primary key,
    colorcode     varchar(100) default ''
);

create table activities (
    id            bigserial    primary key,
    description   text         default '',
    activitytype  text,
    etcservicemap varchar(256) default '',
    foreign key (activitytype) references activitytypes(activitytype),
);

create table activity_country_mapping (
    activityid  bigserial,
    country     varchar(2),
    primary key (activityid, country),
    foreign key (activityid) references activities(id),
    foreign key (country) references countries(iso)
)

create table events (
    id        bigserial    primary key,
    event     varchar(256) not null,
    startdate timestamp    default current_timestamp,
    enddate   timestamp    default current_timestamp,
    colorcode varchar(100) default ''
);

create table languages (
    language varchar(200) primary key
);

-- Join with staff table to get staff's languages
create table staff_language_mapping (
    staffindex  integer,
    language    varchar(200),
    primary key (staffindex, language),
    foreign key (staffindex) references staff(index),
    foreign key (language) references languages(language)
);

create table staffconfirmedtypes (
    stafftype varchar(100) primary key
);

create table activityroles (
    id         bigserial     primary key,
    activityid bigserial,
    startdate  timestamp     default current_timestamp,
    enddate    timestamp     default current_timestamp,
    location   varchar(200)  default '',
    foreign key (activityid) references activities(id)
);

create table staffroles (
    id                 bigserial     primary key,
    activityrole       bigserial,
    startdate          timestamp     default current_timestamp,
    enddate            timestamp     default current_timestamp,
    location           varchar(200),
    comments           text          default '',
    staffconfirmedtype varchar(100),
    foreign key (staffconfirmedtype) references staffconfirmedtypes(stafftype)
);

-- Join with staff role to get activity roles
create table staffrole_activityrole_mapping (
    staffroleid    bigserial,
    activityroleid bigserial,
    primary key (staffroleid, activityroleid),
    foreign key (staffroleid) references staffroles(id),
    foreign key (activityroleid) references activitiyroles(id)
);

-- Join with staff to get staff roles
create table staff_staffrole_mapping (
    staffindex  bigserial,
    staffroleid bigserial,
    primary key (staffindex, staffroleid),
    foreign key (staffindex) references staff(index),
    foreign key (staffroleid) references staffroles(id)
);

create table missiontypes (
    missiontype varchar(100) primary key
);

create table missions (
    id          bigserial    primary key,
    missionname varchar(256) not null,
    missiontype varchar(100),
    location    varchar(200) not null,
    description text         default '',
    startdate   timestamp    default current_timestamp,
    enddate     timestamp    default current_timestamp,
    foreign key (missiontype) references missiontypes(missiontype)
);

-- Join with mission table to get a mission's activities
create table mission_activity_mapping (
    missionid  bigserial,
    activityid bigserial,
    primary key (missionid, activityid),
    foreign key (missionid) references missions(id),
    foreign key (activityid) references activities(id)
)

create table operationtypes (
    operationname varchar(50) primary key
);

create table audittable (
    auditid     bigserial    primary key,
    changedtime timestamp    default current_timestamp,
    userid      varchar(100),
    tablename   varchar(50),
    operation   varchar(50),
    oldvalue    text         default '',
    newvalue    text         default '',
    ipaddress   varchar(256) not null,
    foreign key (operation) references operationtypes(operationname)
);
