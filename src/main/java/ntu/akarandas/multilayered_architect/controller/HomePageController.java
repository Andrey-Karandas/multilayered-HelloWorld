package ntu.akarandas.multilayered_architect.controller;

import ntu.akarandas.multilayered_architect.service.HomePageService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Getter
@Setter
@AllArgsConstructor
@Controller
public class HomePageController {
  private HomePageService homePageService;

  @GetMapping("/")
  public @ResponseBody String returnHelloWorld() {
      return homePageService.getHelloString();
  }
}
