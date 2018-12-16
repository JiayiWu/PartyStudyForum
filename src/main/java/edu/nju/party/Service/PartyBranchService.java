package edu.nju.party.Service;

import edu.nju.party.Entity.PartyBranch;

public interface PartyBranchService {

    //修改支部信息包括班子,id验证权限
    public PartyBranch updateBranch(String userID , PartyBranch branchinfo);
}
