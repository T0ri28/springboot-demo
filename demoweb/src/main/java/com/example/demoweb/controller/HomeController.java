package com.example.demoweb.controller;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import com.example.demoweb.Repository.TuyenDungRepository;
import com.example.demoweb.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller  // Chỉ định HomeController là Controller
public class HomeController {

    @Autowired
    TuyenDungRepository repo;

    @GetMapping("/")
    public String homepage1() {
        return "trangchu";  // Trả về trang trangchu.html
    }

    @GetMapping("/{option}")
    public String homepage2(@PathVariable String option) {
        if ("dang-thong-tin-tuyen-dung.html".equals(option)) {
            return "dangthongtintuyendung";  // Trả về trang dangthongtintuyendung.html
        }
        else if ("tim-kiem-viec-lam.html?searchInput=".equals(option)) {
            return "timkiemvieclam";  // Trả về trang timkiemvieclam.html
        }
        return "trangchu"; // Mặc định, trả về trang trangchu.html
    }


    @GetMapping("/tim-kiem-viec-lam.html")
    public String danhSachTuyenDung(@RequestParam("searchInput") String keyword, Model model)
    {
        if(keyword == null){
            List<Post> danhSachTuyenDung = repo.findAll();
            model.addAttribute("danhSachTuyenDung", danhSachTuyenDung);
            return "timkiemvieclam"; // Tên template Thymeleaf
        }
        else {
            List<Post> danhSachTuyenDung = repo.findbytenCongViec(keyword, keyword, keyword);
            model.addAttribute("danhSachTuyenDung", danhSachTuyenDung);
            return "timkiemvieclam";
        }
    }

    @GetMapping("/luuthongtin")
    public String home(Model model) {
        model.addAttribute("tuyenDung", new Post());
        return "dangthongtintuyendung";
    }

    @PostMapping("/luuthongtin")
    public String luuThongTin(Post tuyenDung) {
        repo.save(tuyenDung);
        return "redirect:/";
    }
}

