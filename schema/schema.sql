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
    nationality    varchar(100) default '',
    stafftype      varchar(200),
    staffcolorcode varchar(100) default '',

    foreign key (profiletype) references profiletypes(profiletype),
    foreign key (stafftype) references stafftypes(stafftype)
);

create table activitytypes (
    activity  text         primary key,
    colorcode varchar(100) default ''
);

create table activities (
    id            bigserial    primary key,
    activity      text,
    type          varchar(200) not null,
    country       varchar(2),
    etcservicemap varchar(256) default '',

    foreign key (activity) references activitytypes(activity),
    foreign key (country) references countries(iso)
);

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
create table languagemapping (
    staffindex  integer,
    language    varchar(200),
    primary key (staffindex, language),
    foreign key (staffindex) references staff(index),
    foreign key (language) references languages(language)
);


create table staffconfirmedtypes (
    stafftype varchar(100) primary key
);

create table roles (
    id         bigserial     primary key,
    activityid bigserial,
    startdate  timestamp     default current_timestamp,
    enddate    timestamp     default current_timestamp,
    location   varchar(200)  default '',
    foreign key (activityid) references activities(id)
);

-- Join with staff table to get a staff's role
create table staffroles (
    id         bigserial     primary key,
    staffrole  bigserial,
    staffindex integer,
    startdate  timestamp     default current_timestamp,
    enddate    timestamp     default current_timestamp,
    location   varchar(200),
    comments   text          default '',
    stafftype  varchar(100),
    foreign key (staffrole) references roles(id),
    foreign key (staffindex) references staff(index),
    foreign key (stafftype) references staffconfirmedtypes(stafftype)
);

create table missionmetatypes (
    missiontype varchar(100) primary key
);

create table mission (
    id          bigserial    primary key,
    missionname varchar(256),
    missiontype varchar(100),
    location    varchar(200),
    description text,
    startdate   timestamp    default current_timestamp,
    enddate     timestamp    default current_timestamp,
    foreign key (missiontype) references missionmetatypes(missiontype)
);

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
    ipaddress     varchar(256) not null,
    foreign key (operation) references operationtypes(operationname)
);
