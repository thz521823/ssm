package org.ling.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
public class DownloadController {
    @RequestMapping("/download")
    public void getDownload(String fileName, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setHeader("Context-Disposition","attachment; fileName="+fileName);
        ServletOutputStream sos = resp.getOutputStream();
        File file = new File(req.getServletContext().getRealPath("files"),fileName);
                byte[] bytes = FileUtils.readFileToByteArray(file);
                sos.write(bytes);
                sos.flush();
                sos.close();

    }
}
