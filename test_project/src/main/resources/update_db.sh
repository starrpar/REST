mysql -u root -p1234 -e "CREATE DATABASE mydb;"
mysql -u root -p1234 -e "ALTER USER 'root'@'localhost' IDENTIFIED BY 'abcd1234';"
mysql -u root -pabcd1234 mydb < src/main/resources/data-dump.sql