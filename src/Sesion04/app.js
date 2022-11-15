var http = require( 'http' );

const server = http.createServer( ( req, res ) => {
  res.statusCode = 200;
  res.setHeader( 'Content-Type', 'text/plain' );
  res.end( 'Hello Ignacio\n' );
} )

server.listen( port, hostname, () => {
  console.log( `Server running at: http://${ hostname }:${ port }` );
} )