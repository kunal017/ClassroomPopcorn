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

        String query;
        if (keyword==null)
            query = DBUtils.prepareSelectQuery("", "classroompopcorn.moviedetail","");
        else
            query = DBUtils.prepareSelectQuery("", "classroompopcorn.moviedetail", "movieName LIKE '%"+keyword+"%'");

        try {
            conn = DBUtils.getConnection();
            stmtt = conn.prepareStatement(query);
            System.out.println("stmtt: "+stmtt);
            rs = stmtt.executeQuery();

            return rs;
        } catch (SQLException sql) {
            sql.printStackTrace();
        } finally {
//            DBUtils.closeAll(rs,stmtt,conn);
        }
        return rs;
    }

}