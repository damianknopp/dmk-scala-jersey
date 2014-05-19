package dmk.web.rest

import scala.collection.JavaConversions._
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.POST
import javax.ws.rs.PathParam
import scala.xml.Elem

@Path("/nc/login")
class LoginRecordingResource{
  val logger: Logger = LoggerFactory.getLogger(classOf[LoginRecordingResource])

  @Path("/user/{name}")
  @GET
  @Produces(Array(MediaType.APPLICATION_XML))
  def remindUserToLogin(@PathParam("name") name: String): String = {
	return LoginRecordingResource.generateLoginReminder(name).toString()
  }
  
  @Path("/user/{name}")
  @POST
  @Produces(Array(MediaType.APPLICATION_XML))
  def remindUserToLoginByPost(@PathParam("name") name: String): String = {
	return LoginRecordingResource.generateLoginReminder(name).toString()
  }
}

object LoginRecordingResource{
    def generateLoginReminder(name: String): Elem = {
	  val msg = <Response>
	<Say voice="alice">Hello {name}. This is a courtesy call from Next Century reminding you to check in by eleven O clock.
	</Say>
	<Say voice="alice">Thank you, good bye.</Say>
	</Response>
	  return msg
  	}
}