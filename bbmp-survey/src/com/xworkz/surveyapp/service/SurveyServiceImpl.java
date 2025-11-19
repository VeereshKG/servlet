package com.xworkz.surveyapp.service;

import com.xworkz.surveyapp.dto.SurveyDTO;
import com.xworkz.surveyapp.exception.DataInValidException;

public class SurveyServiceImpl implements SurveyService {
    @Override
    public void validateAndSave(SurveyDTO surveyDTO) throws DataInValidException {
        System.out.println("Validating And saving data");

        boolean isInvalid = false;

        if (surveyDTO == null) {
            isInvalid = true;
        } else if (surveyDTO.getName() == null || surveyDTO.getName().length() < 3) {
            isInvalid = true;
        } else if (surveyDTO.getOccupation() == null || surveyDTO.getOccupation().length() < 3) {
            isInvalid = true;
        } else if (surveyDTO.getEducation() == null || surveyDTO.getEducation().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getNativePlace() == null || surveyDTO.getNativePlace().length() < 3) {
            isInvalid = true;
        } else if (surveyDTO.getAge() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getDob() == null || surveyDTO.getDob().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getGender() == null || surveyDTO.getGender().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getMotherTongue() == null || surveyDTO.getMotherTongue().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getReligion() == null || surveyDTO.getReligion().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getCaste() == null || surveyDTO.getCaste().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getMobile() <= 0 || surveyDTO.getMobile()<9) {
            isInvalid = true;
        } else if (surveyDTO.getFriendName() == null || surveyDTO.getFriendName().length() < 3) {
            isInvalid = true;
        } else if (surveyDTO.getShoeSize() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getNoOfShoes() < 0) {
            isInvalid = true;
        } else if (surveyDTO.getFatherName() == null || surveyDTO.getFatherName().length() < 3) {
            isInvalid = true;
        } else if (surveyDTO.getMotherName() == null || surveyDTO.getMotherName().length() < 3) {
            isInvalid = true;
            //getMarried
        } else if (surveyDTO.getSpouseName() == null || surveyDTO.getSpouseName().length() < 3) {
            isInvalid = true;
        } else if (surveyDTO.getNoOfChildren() < 0) {
            isInvalid = true;
        } else if (surveyDTO.getFamilyMembers() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getAadhar() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getPan() == null || surveyDTO.getPan().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getVoterId() == null || surveyDTO.getVoterId().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getPassport() == null || surveyDTO.getPassport().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getRationCard() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getBikeNo() == null || surveyDTO.getBikeNo().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getCarNo() == null || surveyDTO.getCarNo().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getNoOfCycles() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getLand() == null || surveyDTO.getLand().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getSites() <= 0) {
            isInvalid = true;
        } else if (surveyDTO.getGold() == null || surveyDTO.getGold().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getSilver() == null || surveyDTO.getSilver().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getLaptop() == null || surveyDTO.getLaptop().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getTv() == null || surveyDTO.getTv().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getShareHolding() == null || surveyDTO.getShareHolding().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getIncome() <= 0.0) {
            isInvalid = true;
        } else if (surveyDTO.getBankAccountNo() ==0) {
            isInvalid = true;
        } else if (surveyDTO.getInsuranceCompany() == null || surveyDTO.getInsuranceCompany().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getInsuranceNo() == null || surveyDTO.getInsuranceNo().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getDiseases() == null || surveyDTO.getDiseases().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getBloodGroup() == null || surveyDTO.getBloodGroup().isEmpty()) {
            isInvalid = true;
//            //getDisabled
        } else if (surveyDTO.getTaxes() == null || surveyDTO.getTaxes().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getElectricityBill() == null || surveyDTO.getElectricityBill().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getWaterBill() == null || surveyDTO.getWaterBill().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getBuildingOwner() == null || surveyDTO.getBuildingOwner().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getCrop() == null || surveyDTO.getCrop().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getRtc() == null || surveyDTO.getRtc().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getLoanNo() < 0) {
            isInvalid = true;
        } else if (surveyDTO.getLoanBalance() < 0.0) {
            isInvalid = true;
        } else if (surveyDTO.getLoanType() == null || surveyDTO.getLoanType().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getPetName() == null || surveyDTO.getPetName().isEmpty()) {
            isInvalid = true;
        } else if (surveyDTO.getNoOfCows() < 0) {
            isInvalid = true;
        }


        if (isInvalid) {
            throw new DataInValidException("Entered Data is Invalid");
        }
    }
}
