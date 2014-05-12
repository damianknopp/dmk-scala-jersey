package dmk.web.conf

import java.util.Set

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.ServletContainerInitializer
import javax.servlet.ServletContext


class WebAppInit extends ServletContainerInitializer{
  val logger: Logger = LoggerFactory.getLogger(classOf[WebAppInit])

  def onStartup(c: Set[Class[_]], ctx: ServletContext): Unit = {
    logger.debug("webappinit")
    val names = ctx.getServletNames()
    while(names.hasMoreElements()){
    	logger.debug(names.nextElement())
    }
  }
  
}
