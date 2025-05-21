mysql -u root -pabcd1234 -e "DROP DATABASE mydb;"
mysql -u root -pabcd1234 -e "ALTER USER 'root'@'localhost' IDENTIFIED BY '1234';"
mysql -u root -p1234 -e "SHOW DATABASES;"