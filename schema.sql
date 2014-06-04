create table countries (
    iso	     varchar(2)   primary key,
    fullname varchar(200) not null,
    region   varchar(200) default ''
);

create table profiletypes (
    profile  varchar(200) primary key
);


create table staff (
    index          integer,
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
    activity      varchar(200) not null,
    type          varchar(200) not null,
    country       varchar(2),
    etcservicemap varchar(256) default '',

    foreign key (country) references countries(iso)
);

create table activitytypes (
    id        bigserial    primary key,
    activity  text         not null,
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
    staffid     bigserial,
    language    varchar(200),
    primary key (staffid, language),
    foreign key (staffid) references staff(id),
    foreign key (language) references languages(language)
);

create table roles (
    id         bigserial     primary key,
    activityid varchar(200),
    startdate  datetime      default current_timestamp,
    enddate    datetime      default current_timestamp,
    location   varchar(200)  default '',
    foreign key (id) references staffroles(id),
    foreign key (activityid) references activities(id)
);

create table staffroles (
    id         bigserial     primary key,
    role       number,
    staffindex number,
    startdate  datetime,
    enddate    datetime,
    location   varchar(200),
    comments   text          default '',
    stafftype  varchar(100),
    foreign key (stafftype) references staffconfirmedtype(stafftype)
);

create table staffconfirmedtype (
    stafftype varchar(100) primary key
);

create table mission (
    id          bigserial    primary key,
    missionname varchar(256),
    location    varchar(200),
    description text,
    startdate   datetime,
    enddate     datetime
);

create table missionmetatype (
    missiontype varchar(100) primary key
);

create table logintable (
    userid        varchar(100) primary key,
    email         varchar(256),
    password      varchar(256),
    profiletype   varchar(100),
    createddate   timestamp    default current_timestamp,
    firstloggedin timestamp,
    lastloggedin  timestamp,
    isonline      boolean      default false,
    ipaddress     varchar(256) not null,
    foreign key (profiletype) references profiletypes(profile)
);

create table audittable (
    auditid     bigserial    primary key,
    changedtime timestamp    default current_timestamp,
    userid      varchar(100), --fk
    tablename   varchar(50),
    operation   varchar(50), --fk
    oldvalue    text         default '',
    newvalue    text         default '',
    foreign key (userid) references logintable(userid),
    foreign key (operation) references operationtypes(operationname)
);

create table operationtypes (
    operationname varchar(50) primary key
);
