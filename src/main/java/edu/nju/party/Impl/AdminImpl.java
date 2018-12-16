package edu.nju.party.Impl;


import edu.nju.party.Entity.Note;
import edu.nju.party.Entity.PartyBranch;
import edu.nju.party.Service.AdminService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminImpl implements AdminService {


    @Override
    public ArrayList<PartyBranch> getAllBranch() {
        return null;
    }

    @Override
    public ArrayList<Note> getAllNote() {
        return null;
    }

    @Override
    public PartyBranch createBranch(PartyBranch branchinfo) {
        return null;
    }


    @Override
    public boolean deleteBranch(int grade, int index) {
        return false;
    }


}
