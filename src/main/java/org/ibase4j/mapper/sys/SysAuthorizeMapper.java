package org.ibase4j.mapper.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ibase4j.model.sys.SysMenu;

/**
 * @author ShenHuaJie
 * @since 2018年3月3日 下午7:29:43
 */
public interface SysAuthorizeMapper {

	void deleteUserMenu(@Param("userId") Long userId, @Param("permission") String permission);

	void deleteUserRole(@Param("userId") Long userId);

	void deleteRoleMenu(@Param("roleId") Long roleId, @Param("permission") String permission);

	List<Long> getAuthorize(@Param("userId") Long userId);

	List<String> queryPermissionByUserId(@Param("userId") Long userId);

	List<SysMenu> queryMenusPermission();
}