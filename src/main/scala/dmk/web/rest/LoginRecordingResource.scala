package dmk.web.rest

import scala.collection.JavaConversions._
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.POST

@Path("/nc/login")
class LoginRecordingResource{
  val logger: Logger = LoggerFactory.getLogger(classOf[LoginRecordingResource])

  @Path("/test")
  @GET
  @Produces(Array(MediaType.APPLICATION_XML))
  def testMesg(): String = {
		  return LoginRecordingResource.tmp.toString()
  }
  
  @Path("/test")
  @POST
  @Produces(Array(MediaType.APPLICATION_XML))
  def testMesgOnPost(): String = {
		  return LoginRecordingResource.tmp.toString()
  }

}

object LoginRecordingResource{
  val tmp = <Response>
	<Say voice="alice">Hello Damian.  This is Alice speaking.
	</Say>
	<Pause length="1" />
	<Say voice="alice">Let us know if I can help you in any way during your
		development.
	</Say>
</Response>

}