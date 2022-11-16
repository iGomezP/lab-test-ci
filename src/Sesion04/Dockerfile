FROM node:18.12.1

WORKDIR /usr/src/app

COPY package*.json ./

COPY app.js ./

RUN npm install

RUN npm start

# Comando donde corre la aplicación
EXPOSE 8080