package org.jetbrains.kotlin.demo

import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "Hello", value = "/hello")
class HomeController : HttpServlet() {
    override fun doGet(req: HttpServletRequest, res: HttpServletResponse) {
        val i = req.parameterMap.size
        res.writer.write("Hello, World login success = " + validateUsername(req))
    }

    fun validateUsername(req: HttpServletRequest):Boolean {
        val username = req.parameterMap.get("username")
        if (username != null) {
            return username[0].contentEquals("pavan")
        }
        return false
    }
}