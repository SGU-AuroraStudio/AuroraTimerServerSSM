package com.aurora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @Author Yao
 * @Date 2021/4/14 12:55
 * @Description
 */
@Controller
public class FileDownloadController {
    @RequestMapping("/soft/{fileName}")
    public void downloadJAR(HttpServletRequest request, HttpServletResponse response, @PathVariable String fileName) throws IOException {
        String dataDirectory = request.getServletContext().getRealPath("/soft");
        File file = new File(dataDirectory, fileName);
        if (file.exists())
        {
            response.setContentType("application/java-archive");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                FileInputStream in = new FileInputStream(file);
                ServletOutputStream out = response.getOutputStream();
                byte[] buffer = new byte[8192];
                int read;
                while ((read = in.read(buffer, 0, 8192)) >= 0) {
                    out.write(buffer, 0, read);
                }
                in.close();
                out.close();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }else {
            response.sendError(404);
        }
    }

}
