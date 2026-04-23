create table categories (
    id tinyint primary key,
    name varchar(255) not null
);

create table products (
    id bigint primary key,
    name varchar(255) not null,
    price decimal(10,2) not null,
    category_id tinyint not null,

    foreign key categories_products (category_id)
        references categories (id)
        on delete no action
        on update cascade
)