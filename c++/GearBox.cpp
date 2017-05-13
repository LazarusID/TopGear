#include "GearBox.h"

GearBox::GearBox() : s(0), e(0) {

}

void GearBox::doit(int i) {
    if (s < 0) {
        // do nothing
        e = i;
    } else {
        if (s > 0) {
            if (i > 2000)
                s++;
        } else if (i < 500) {
            s--;
        }
    }
    if (s > 6) {
        s--;
    } else if (s < 1) {
        s++;
    }
    e = 1;
}

int GearBox::currentGear(void) {
    return s;
}


