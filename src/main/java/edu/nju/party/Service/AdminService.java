package edu.nju.party.Service;

import edu.nju.party.Entity.Note;
import edu.nju.party.Entity.PartyBranch;

import java.util.ArrayList;

public interface AdminService {

    //获取当前所有支部
    public ArrayList<PartyBranch> getAllBranch();

    //获取当前所有帖子，包括回帖
    public ArrayList<Note> getAllNote();

    public PartyBranch createBranch(PartyBranch branchinfo);



    public boolean deleteBranch(int grade,int index);







}
