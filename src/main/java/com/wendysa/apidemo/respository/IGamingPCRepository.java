package com.wendysa.apidemo.respository;

import java.util.List;
import com.wendysa.apidemo.models.GamingPc;

public interface IGamingPCRepository {
    List<GamingPc> getAll(int limit);
}