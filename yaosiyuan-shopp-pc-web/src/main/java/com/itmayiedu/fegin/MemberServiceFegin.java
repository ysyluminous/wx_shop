package com.yaosiyuan.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

import com.yaosiyuan.api.service.MemberService;

@Component
@FeignClient("member")
public interface MemberServiceFegin extends MemberService {

}
