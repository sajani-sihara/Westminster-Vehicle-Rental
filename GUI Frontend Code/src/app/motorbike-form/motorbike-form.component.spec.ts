import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MotorbikeFormComponent } from './motorbike-form.component';

describe('MotorbikeFormComponent', () => {
  let component: MotorbikeFormComponent;
  let fixture: ComponentFixture<MotorbikeFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MotorbikeFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MotorbikeFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
