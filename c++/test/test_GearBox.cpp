#include "../GearBox.h"

#include <gtest/gtest.h>
#include <gmock/gmock.h>

using namespace ::testing;

class testGearBox : public ::testing::Test {
public:
    GearBox box;

    void shiftUp(void) {
        box.doit(2001);
    }

    void shiftDown(void) {
        box.doit(499);
    }
};

TEST_F(testGearBox, currentGear_byDefault_returns0) {
    ASSERT_THAT(box.currentGear(), Eq(0));
}

TEST_F(testGearBox, currentGear_afterShiftUp_returns1) {
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(1));
}

TEST_F(testGearBox, currentGear_afterTwoShiftUp_returns2) {
    shiftUp();
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(2));
}

TEST_F(testGearBox, currentGear_afterThreeShiftUp_returns3) {
    shiftUp();
    shiftUp();
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(3));
}

TEST_F(testGearBox, currentGear_afterFourShiftUp_returns4) {
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(4));
}

TEST_F(testGearBox, currentGear_afterFiveShiftUp_returns5) {
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(5));
}

TEST_F(testGearBox, currentGear_afterSixShiftUp_returns6) {
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(6));
}

TEST_F(testGearBox, currentGear_afterSevenShiftUp_returns6) {
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    shiftUp();
    ASSERT_THAT(box.currentGear(), Eq(6));
}
