package com.ust.Emp_info.fegin;

import com.ust.Emp_info.Client.project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name="Projectinfo", url="http://localhost:9091/project")
public interface ProjectClient {
    @GetMapping("project/{ccode}")
    List<project> findProjectsByCcode(@PathVariable("ccode") Long ccode);
}
