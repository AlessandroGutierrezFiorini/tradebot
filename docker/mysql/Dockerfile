#Base image for mysql from oficial mysql
FROM mysql:5.7

ADD scripts/trade_db.sql /tmp/mysqlscripts/trade_db.sql

ENV	MYSQL_ROOT_PASSWORD=root \
	MYSQL_USER=root \
	MYSQL_PASSWORD=1111 \
	MYSQL_DATABASE=tradeDb

VOLUME ["/etc/mysql", "/var/lib/mysql"]

EXPOSE 3306