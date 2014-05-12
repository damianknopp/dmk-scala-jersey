package dmk.web.rest

import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.GET
import javax.ws.rs.core.MediaType
import org.slf4j.LoggerFactory
import org.slf4j.Logger
import scala.collection.JavaConversions._

@Path("/sysevents")
class SysEventResource{
  val logger: Logger = LoggerFactory.getLogger(classOf[SysEventResource])

  @GET
  @Produces(Array(MediaType.APPLICATION_JSON))
  def getAllSysEvents(): java.util.List[String] = {
    logger.debug("get all sysevents")
	SysEventResource.sampleDb
  }
}

object SysEventResource{
  val sampleDb = List("sysevent1", "sysevent2")

}