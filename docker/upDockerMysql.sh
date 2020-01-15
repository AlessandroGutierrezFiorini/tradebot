#!/bin/bash
echo "Initializing Docker"
#docker-compose up
docker-compose --file "docker-compose.yml" up -d > /dev/null
#
echo "Setting Docker mysql..."
sleep 10

docker exec -i tradeBotApiDb bash -c 'echo "CREATE DATABASE tradeDb" | mysql -u root -proot'
#
docker exec -i tradeBotApiDb bash -c 'mysql -uroot -proot tradeDb < /tmp/mysqlscripts/trade_db.sql'
echo "Created tradeBotApiDb database on docker."

echo "Environment up on docker and ready to use."
echo ""
echo ""
echo "                    ##        .            "
echo "              ## ## ##       ==            "
echo "           ## ## ## ##      ===            "
echo "       /""""""""""""""""\\\___/ ===        "
echo "  ~~~ {~~ ~~~~ ~~~ ~~~~ ~~ ~ /  ===- ~~~   "
echo "       \\\______ o          __/            "
echo "         \\\    \\\        __/             "
echo "          \\\____\\\______/                "
echo "                                           "
echo "           |          |                    "
echo "        __ |  __   __ | _  __   _          "
echo "       /  \| /  \ /   |/  / _\ |           "
echo "       \__/| \__/ \__ |\_ \__  |           "
echo ""
echo ""