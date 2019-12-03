package br.com.av.agenda.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class StringUtils {
    
    public static String formatarData(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(data);
    }
    
    public static Date converterData(String data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.parse(data);
    }
    
    public static Calendar converterDataCalendar(String dataCalendar) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(formato.parse(dataCalendar));
        return calendar;
    }
    
    public static String formatarDataCalendar(Calendar dataCalendar) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dataCalendar.getTime());
    }
    
    public static String getHoraCalendar(Calendar horaCalendar) throws ParseException{
        String minutos;
        if(horaCalendar.get(horaCalendar.MINUTE) == 00){
            minutos = String.valueOf(horaCalendar.get(horaCalendar.MINUTE))+"0";
        }else{
            minutos = String.valueOf(horaCalendar.get(horaCalendar.MINUTE));
        }
        
        return String.valueOf(horaCalendar.get(horaCalendar.HOUR_OF_DAY))+":"+ minutos;
    }
}
