package com.bbarkthong.bbs.no_fe.model.VO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserVO {
    private String user_id;
    private String user_nm;
    private String gender;
}
