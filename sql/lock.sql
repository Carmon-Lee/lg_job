create table lock_def
(
    id             varchar(10),
    app_name       varchar(100),
    lock_status    varchar(10),
    last_lock_time date,
    next_trig_time date,
    lock_duration  integer(11),
    remote_ip      varchar(100)
) engine = innodb;

create table lock_invoke_log
(
    log_id          integer(11),
    lock_id         varchar(10),
    start_lock_time date,
    end_lock_time   date,
    lock_duration   integer(11),
    remote_ip       varchar(100)
) engine = innodb;

insert into lock_def (id,
                      app_name,
                      lock_status)
values ('1000000000','uw','unlocked');

select *
from lock_def;


update lock_def set lock_status='locked' where id='1000000000' and lock_status='unlocked'
