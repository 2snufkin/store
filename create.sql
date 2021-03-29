create table address (id integer not null auto_increment, adress_line varchar(255), adress_line2 varchar(255), city varchar(255), country varchar(255), phone_number varchar(255), zip varchar(255), user_id integer, primary key (id)) engine=InnoDB
create table category (id integer not null auto_increment, category varchar(255), primary key (id)) engine=InnoDB
create table order (id integer not null auto_increment, created_at date, shiped_at date, status varchar(255), total double precision not null, shipping_id integer, user_id integer, primary key (id)) engine=InnoDB
create table order_line (id integer not null auto_increment, quantity integer not null, total double precision not null, unit_price double precision not null, order_id integer, product_id integer, primary key (id)) engine=InnoDB
create table payment (id integer not null auto_increment, card_type varchar(255), currency varchar(255), status varchar(255), sum double precision not null, order_id integer, primary key (id)) engine=InnoDB
create table product (id integer not null auto_increment, description varchar(255), name varchar(255), price double precision not null, stock varchar(255), category_id integer, primary key (id)) engine=InnoDB
create table review (id integer not null auto_increment, content varchar(255), created date, note varchar(255), type varchar(255), order_line_id integer, primary key (id)) engine=InnoDB
create table shipping (id integer not null auto_increment, delivery_date date, price double precision not null, address_id integer, primary key (id)) engine=InnoDB
create table user (id integer not null auto_increment, email varchar(255), first_name varchar(255), inscription_date date, last_name varchar(255), password varchar(255), user_name varchar(255), primary key (id)) engine=InnoDB
alter table user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email)
alter table user add constraint UK_lqjrcobrh9jc8wpcar64q1bfh unique (user_name)
alter table address add constraint FKda8tuywtf0gb6sedwk7la1pgi foreign key (user_id) references user (id)
alter table order add constraint FKm1ga2jksw26c5hj0a1nu1la23 foreign key (shipping_id) references shipping (id)
alter table order add constraint FKt7abetueht6dd1gs9jyl3o4t7 foreign key (user_id) references user (id)
alter table order_line add constraint FKsag994hw7thnj0xefj4gl1wod foreign key (order_id) references order (id)
alter table order_line add constraint FKpf904tci8garypkvm32cqupye foreign key (product_id) references product (id)
alter table payment add constraint FK458pu56xefty15ugupb46wrin foreign key (order_id) references order (id)
alter table product add constraint FK1mtsbur82frn64de7balymq9s foreign key (category_id) references category (id)
alter table review add constraint FKdffd9a9xyihyxt2f7qvayh5pp foreign key (order_line_id) references order_line (id)
alter table shipping add constraint FKj6ayrlwisv2n1yalmjxjlu62p foreign key (address_id) references address (id)
