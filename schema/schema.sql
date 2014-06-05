create table countries (
    iso	     varchar(2)   primary key,
    fullname varchar(200) not null,
    region   varchar(200) default ''
);

create table profiletypes (
    profile  varchar(200) primary key
);


create table staff (
    index          integer      primary key,
    firstname      varchar(256) not null,
    lastname       varchar(256) not null,
    dateofbirth    datetime,
    title          varchar(256),
    profile        varchar(200),
    thuraya        varchar(50),
    mobile         varchar(50),
    nationality    varchar(100),
    type           varchar(200),
    staffcolorcode varchar(100),

    foreign key (profile) references profiletypes(profile),
    foreign key (type) references stafftypes(stafftype)
);
create table stafftypes (
    stafftype varchar(200) primary key
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

create table activitytypes (
    activity  text         primary key,
    colorcode varchar(100) default ''
);

create table events (
    id        bigserial    primary key,
    event     varchar(256) not null,
    startdate datetime     default current_timestamp,
    enddate   datetime     default current_timestamp,
    colorcode varchar(100) default '',
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

create table roles (
    id         bigserial     primary key,
    activity   varchar(200),
    startdate  datetime      default current_timestamp,
    enddate    datetime      default current_timestamp,
    location   varchar(200)  default '',
    foreign key (id) references staffroles(id),
    foreign key (activity) references activities(activity)
);

-- Join with staff table to get a staff's role
create table staffroles (
    id         bigserial,
    role       number,
    staffindex number,
    startdate  datetime,
    enddate    datetime,
    location   varchar(200),
    comments   text          default '',
    stafftype  varchar(100),
    primary key (id, staffindex),
    foreign key (index) references staff(index),
    foreign key (stafftype) references staffconfirmedtypes(stafftype)
);

create table staffconfirmedtypes (
    stafftype varchar(100) primary key
);

create table mission (
    id          bigserial    primary key,
    missionname varchar(256),
    missiontype varchar(100),
    location    varchar(200),
    description text,
    startdate   datetime,
    enddate     datetime,
    foreign key (missiontype) references missionmetatypes(missiontype)
);

create table missionmetatypes (
    missiontype varchar(100) primary key
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

create table operationtypes (
    operationname varchar(50) primary key
);
