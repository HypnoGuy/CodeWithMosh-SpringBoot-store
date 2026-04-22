create table profiles (
    id bigint primary key,
    bio text null,
    phone_number varchar(15) null,
    date_of_birth date null,
    loyalty_points int unsigned default 0 not null,

    foreign key user_profile (id)
        references users(id)
        on update cascade
        on delete cascade
);