package com.i2i.dcs.util;

import com.i2i.dcs.common.Constant;
import com.i2i.dcs.exception.InvalidRequestException;

import java.time.LocalDate;
import java.util.List;

public class CommonUtil {

    /**
     * <p>
     * Check the doctor license is valid or not.
     * This checks whether the given license is issued by medical councils and the doctor got the license in valid year.
     * </p>
     *
     * @param doctorLicense This is the unique license given for the doctor.
     * @param dob This is the date of birth of the doctor given in (yyyy-MM-dd).
     * @return true if the timing is before the appointment date, otherwise else false.
     */
    public static Boolean isLicenseValid(String doctorLicense, LocalDate dob) {
        try {
            List<String> license = List.of(doctorLicense.split("/"));
            if (Constant.REGISTERED_MEDICAL_COUNCILS.contains(license.get(0))) {
                int year = Integer.parseInt(license.get(1));
                return year < LocalDate.now().getYear() && year >= (dob.getYear() + 23) && year <= (dob.getYear() + 50) && year >= 1950;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new InvalidRequestException("Not a valid year given in doctor license, It should be Integer");
        }
    }
}
