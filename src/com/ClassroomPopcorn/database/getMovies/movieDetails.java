package com.ClassroomPopcorn.database.getMovies;

import com.ClassroomPopcorn.database.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class movieDetails {

    public static ResultSet movieDetails(String keyword, String genreFilter, String ratingFilter, String orderFilder){

        Connection conn = null;
        PreparedStatement stmtt = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            System.out.println("Connection "+conn);
            stmtt = conn.prepareStatement("SELECT * FROM `classroompopcorn`.`moviedetail`;");
            rs = stmtt.executeQuery();
            String 
            return rs;
        } catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
            DBUtils.closeStatement(stmtt);
            DBUtils.closeConnection(conn);
        }
        return rs;
    }

}