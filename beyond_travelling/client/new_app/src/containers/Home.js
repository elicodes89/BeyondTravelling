import React , { useState } from 'react';
// import Header from '../components/Header';
import './Home.css';
import Wheelchair from '../access_icons/wheelchair.png';
import Sign from '../access_icons/sign.png';
import BSL from '../components/bsl/BSL';
import Button from 'react-bootstrap/Button';
import AccessibleHotels from '../components/wheelchair/AccessibleHotels';


function Home () {
  const [wheelchair, setWheelchair] = useState(false);
  const [bsl, setBsl] = useState(false); 

  if (wheelchair === false && bsl === false) {

return (
  <>
  {/* <Header /> */}
    <div className='title'>
    <h2>YOUR TRAVEL APP FOR ACCESSIBLE HOLIDAYS</h2>
    </div>
    <div className='homeButtons'>
    <img className = "homeImage" onClick = { () => {setWheelchair(true)} } src={Wheelchair} alt='wheelchairimg' width="500" height="500"/>
    <img className = "homeImage" onClick = { () => {setBsl(true)} } src={Sign} alt='signimg' width="500" height="500"/>
    </div>
  </>

  );

} else if (wheelchair === true) {

  return (
      <>
      {/* <Header /> */}
      <AccessibleHotels />
      <Button variant="light" onClick = { () => {setWheelchair(false)} }>GO BACK</Button>
      </>
  
      );

}else if (bsl === true) {
    return (
      <>
      <BSL />
      <Button variant="light" onClick = { () => {setBsl(false)} }>GO BACK</Button>
      </>
    )
}

};
export default Home;