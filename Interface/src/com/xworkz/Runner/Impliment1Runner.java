package com.xworkz.Runner;

import com.xworkz.Internal.*;
import com.xworkz.implimentation1.*;

public class Impliment1Runner {

    public static void main(String[] args) {

        System.out.println("=====================1=======================");
        BagRule bagRule = new Shop();
        bagRule.timeToPackBag();
        bagRule.timeToUnpackBag();
        bagRule.timeToCarryBag();
        BottelRule bottelRule = new Shop();
        bottelRule.timeToEmptyBottel();
        bottelRule.timeToCleanBottel();
        bottelRule.timeToCheckBottel();
        System.out.println("=====================2=======================");
        CarRule carRule = new Cars();
        carRule.noSpeeding();
        carRule.noDrunkDriving();
        carRule.wearSeatBelt();
        OffRoadCarRule offRoadCarRule = new Cars();
        offRoadCarRule.timeToRefuel();
        offRoadCarRule.timeToWash();
        offRoadCarRule.timeToService();
        System.out.println("=====================3=======================");
        BicycleRule bicycleRule = new Bikes();
        bicycleRule.timeToStopBicycle();
        bicycleRule.timeToParkBicycle();
        bicycleRule.timeToCheckBicycle();
        BikeRule bikeRule = new Bikes();
        bikeRule.noDrinkAndDrive();
        bikeRule.noOvertaking();
        bikeRule.obeyTrafficSignals();
        System.out.println("=====================4=======================");
        RoomRule roomRule = new Build();
        roomRule.peopleInRoom();
        roomRule.keepClean();
        roomRule.bedClean();
        BuildingRule buildingRule = new Build();
        buildingRule.timeToStartBuilding();
        buildingRule.timeToStopBuilding();
        buildingRule.timeToCheckBuilding();
        System.out.println("=====================5=======================");
        ChargerRule chargerRule = new Device();
        chargerRule.noOvercharging();
        chargerRule.noShortCircuit();
        chargerRule.noFakeCharger();
        PhoneRule phoneRule = new Device();
        phoneRule.timeToCall();
        phoneRule.timeToText();
        phoneRule.timeToVideoCall();
        System.out.println("=====================6=======================");
        BoxingRule boxingRule = new Fight();
        boxingRule.useShoe();
        boxingRule.useGloves();
        boxingRule.useGuard();
        CoupleRule coupleRule = new Fight();
        coupleRule.toLoyaltyCouple();
        coupleRule.ruleToStartCouple();
        coupleRule.toUnderstandCouple();
        System.out.println("=====================7=======================");
        ATMRule atmRule = new Banking();
        atmRule.timeToChangePin();
        atmRule.timeToWithdrawMoney();
        atmRule.timeToCheckBalance();
        BankRule bankRule = new Banking();
        bankRule.timeToCloseBank();
        bankRule.timeToOpenBank();
        bankRule.timeToDepositMoney();
        System.out.println("=====================8=======================");
        HomeRule homeRule = new Construct();
        homeRule.cleanHouse();
        homeRule.timeToWakeUp();
        homeRule.timeToSleep();
        HostelRule hostelRule = new Construct();
        hostelRule.timeToDoLaundry();
        hostelRule.timeToGoOut();
        hostelRule.timeToReturn();
        System.out.println("=====================9=======================");
        ProgramRule programRule = new Programs();
        programRule.noDisrespect();
        programRule.noDisrespect();
        programRule.noInappropriateContent();
        CodingRule codingRule = new Programs();
        codingRule.timeToTest();
        codingRule.timeToCode();
        codingRule.timeToDebug();
        System.out.println("=====================10=======================");
        ChildrenRule childrenRule = new Child();
        childrenRule.toPlayWithChildren();
        childrenRule.toTeachChildren();
        childrenRule.toLoveChildren();
        ExamRule examRule = new Child();
        examRule.timeToCheckAnswerSheet();
        examRule.timeToStopExam();
        examRule.timeToStartExam();
        System.out.println("=====================11=======================");
        ClockRule clockRule = new Time();
        clockRule.resetAlarm();
        clockRule.setAlarm();
        clockRule.snoozeAlarm();
        CompanyRule companyRule = new Time();
        companyRule.timeToLeaveOffice();
        companyRule.timeToTakeBreak();
        companyRule.timeToWork();
        System.out.println("=====================12=======================");
        RoomRule roomRule1 = new Rooms();
        roomRule1.bedClean();
        roomRule1.keepClean();
        roomRule1.peopleInRoom();
        WashRoomRule washRoomRule = new Rooms();
        washRoomRule.noExcessiveNoise();
        washRoomRule.noLittering();
        washRoomRule.noVandalism();
        System.out.println("=====================13=======================");
        TrafficRule trafficRule = new Rules();
        trafficRule.wearHelmet();
        trafficRule.noHorn();
        trafficRule.speedLimit();
        ShowRoomRule showRoomRule = new Rules();
        showRoomRule.timeToOpenShowRoom();
        showRoomRule.timeToDisplayItems();
        showRoomRule.timeToCloseShowRoom();
        System.out.println("=====================14=======================");
        TrainerRule trainerRule = new Professor();
        trainerRule.timeToEat();
        trainerRule.timeToTrain();
        trainerRule.timeToSleep();
        TeacherRule teacherRule = new Professor();
        teacherRule.timeToTeach();
        teacherRule.timeToSleep();
        teacherRule.timeToEat();
        System.out.println("=====================15=======================");
        GovtRule govtRule = new Govt();
        govtRule.noTerrorism();
        govtRule.noCrime();
        govtRule.noCorruption();
        ParlimentRule parlimentRule = new Govt();
        parlimentRule.timeToOpenParliment();
        parlimentRule.timeToDiscussBills();
        parlimentRule.timeToCloseParliment();
        System.out.println("=====================16=======================");
        BrowserRule browserRule = new Internet();
        browserRule.noMalware();
        browserRule.noPhishing();
        browserRule.noPopups();
        NetWorkRule netWorkRule = new Internet();
        netWorkRule.timeToConnect();
        netWorkRule.timeToTransferData();
        netWorkRule.timeToDisconnect();
        System.out.println("=====================17=======================");
        SecurityRule securityRule = new Secure();
        securityRule.timeToSecureArea();
        securityRule.timeToReportIncident();
        securityRule.timeToCheckSecurity();
        SatelliteRule satelliteRule = new Secure();
        satelliteRule.tofocusOnWorkSatellite();
        satelliteRule.toWorkWithTeamSatellite();
        satelliteRule.toTeachTeamSatellite();
        System.out.println("=====================18=======================");
        BakeryRule bakeryRule = new Product();
        bakeryRule.keepClean();
        bakeryRule.payBefore();
        bakeryRule.washHand();
        SoapRule soapRule = new Product();
        soapRule.timeToWashHands();
        soapRule.timeToTakeBath();
        soapRule.timeToUseSoap();
        System.out.println("=====================19=======================");
        MallRule mallRule = new Sellings();
        mallRule.timeToStartMall();
        mallRule.timeToCheckMall();
        mallRule.timeToStopMall();
        MartRule marketRule = new Sellings();
        marketRule.timeToCheckMart();
        marketRule.timeToStartMart();
        marketRule.timeToStopMart();
        System.out.println("=====================20=======================");
        DrivingRule drivingRule = new SomeRules();
        drivingRule.timeToStartDriving();
        drivingRule.timeToParkCar();
        drivingRule.timeToStopDriving();
        WifeRule wifeRule = new SomeRules();
        wifeRule.toSupportWife();
        wifeRule.toLoveWife();
        wifeRule.toRespectWife();


    }
}
