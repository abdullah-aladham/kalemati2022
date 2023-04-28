import { ComponentFixture, TestBed } from '@angular/core/testing';
import { MycardsExplorePage } from './mycards-explore.page';

describe('MycardsExplorePage', () => {
  let component: MycardsExplorePage;
  let fixture: ComponentFixture<MycardsExplorePage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(MycardsExplorePage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
