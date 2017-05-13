#ifndef _GEARBOX_H_
#define _GEARBOX_H_

class GearBox {

	public:
		GearBox();
		void doit(int i);

    int currentGear(void);

	private:
		int s;
		int e;

};

#endif
