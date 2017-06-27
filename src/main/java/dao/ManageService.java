package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageService {

    public final ManageStats manageStats;
    public final ManageUser manageUser;

    @Autowired
    public ManageService(ManageStats manageStats, ManageUser manageUser) {
        this.manageStats = manageStats;
        this.manageUser = manageUser;
    }
}
