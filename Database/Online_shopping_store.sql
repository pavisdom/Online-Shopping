SELECT * FROM online_shopping.items;
create table items
(	itemID int primary key,
	itemName varchar(40) not null,
    price double,
    itemURL varchar(200),
    category int,
    FOREIGN KEY (category) REFERENCES categories(catID)
)
drop table items

create table categories
(	catID int primary key,
	catName varchar(40)
    )
    
create table item_cat
(	catID int,
	itemID int,
    primary key(catID, itemID),
    foreign key (catID) references categories(catID),
    foreign key (itemID) references items(itemID)
    )
    
create table customers
(	userID int primary key,
	cName varchar(40),
    address varchar(100),
    email varchar(100) unique,
    password varchar(20),
    pictureURL varchar(100)
    )
    
    insert into customers(userID) values(1004);
    
create table suppliers
(	supID int primary key,
	cName varchar(40),
    address varchar(100),
    email varchar(100) unique,
    password varchar(20)
    )


create table orders
(	orderID int primary key,
	userID int,
    itemID int,
    quantity int,
    orderDate Date,
    states bool,
    foreign key (userID) references customers(userID),
    foreign key (itemID) references items(itemID)
    )

create table cart
(	userID int,
	itemID int,
    quantity int,
     foreign key (userID) references customers(userID),
    foreign key (itemID) references items(itemID)
    )
    
    

insert into items values(1,'Bag',100)
insert into items values(2,'iPhone',1100)
insert into items values(3,'TV',900)
insert into items values(4,'Watch',190)
insert into items values(5,'Camera',1700)
insert into items values(6,'Shoes',120)
insert into items values(7,'Knife',80)


insert into categories values(1,'Tools, Industrial & Scientific')
insert into categories values(2,'Mobile Phones & Accessories')
insert into categories values(3,'Lights & Lighting')
insert into categories values(4,'Sports & Outdoor')
insert into categories values(5,'Toys Hobbies and Robot')
insert into categories values(6,'Clothing and Apparel')
insert into categories values(7,'Bags & Shoes')
insert into categories values(8,'Home and Garden')
insert into categories values(9,'Health & Beauty')
insert into categories values(10,'Automobiles & Motorcycles')
insert into categories values(11,'Computer & Networking')
insert into categories values(12,'Jewelry and Watch')
select * from categories

exec newCustomer 'pa','wsderef','23','232e','xzfv'