package note.emily.mapper;

import java.util.List;
import note.emily.entity.Member;

public interface MemberMapper {
    int deleteByPrimaryKey(Long memberId);

    int insert(Member record);

    Member selectByPrimaryKey(Long memberId);

    List<Member> selectAll();

    int updateByPrimaryKey(Member record);
}