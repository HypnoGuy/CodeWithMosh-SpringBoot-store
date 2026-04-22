create table tags (
    id int primary key,
    name varchar(255) not null
);

create table user_tags (
    user_id bigint not null,
    tag_id int not null,

    primary key (user_id, tag_id),

    foreign key tag_user_tags (tag_id)
        references tags (id)
        on update cascade
        on delete cascade,

    foreign key user_user_tags (user_id)
        references users (id)
        on update cascade
        on delete cascade
)