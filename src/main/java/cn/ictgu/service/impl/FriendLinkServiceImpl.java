package cn.ictgu.service.impl;

import cn.ictgu.service.FriendLinkService;
import cn.ictgu.service.mapper.FriendLinkMapper;
import cn.ictgu.service.model.FriendLink;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 友情链接
 */
@Service
@Slf4j
@AllArgsConstructor
public class FriendLinkServiceImpl implements FriendLinkService {

    private final FriendLinkMapper friendLinkMapper;

    public List<FriendLink> listHome() {
        return friendLinkMapper.selectShowEqYesDesc();
    }


}
