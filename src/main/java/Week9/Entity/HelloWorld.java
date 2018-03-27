package Week9.Entity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/hello")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/{param}")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces({"application/xml", "application/json", "text/plain", "text/html"})
    public Response getMessage(@PathParam("param") String name) {
        // Return greeting with name
        String output = "Hello " + name;
        return Response.status(200).entity(output).build();
    }

}

