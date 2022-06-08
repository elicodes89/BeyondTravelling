import React , { useState } from 'react';
import './Home.css';
import Wheelchair from '../access_icons/wheelchair.png';
// import Sign from '../access_icons/sign.png';
import SigningLady from '../access_icons/signinglady.gif';

import BSL from '../components/bsl/BSL';
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
    <img className = "homeImage" onClick = { () => {setWheelchair(true)} } src={Wheelchair} alt='wheelchairimg' width="500" height="600"/>
    <img className = "homeImage1" onClick = { () => {setBsl(true)} } src={SigningLady} alt='signimg' width="500" height="500"/>
    </div>
  </>

  );

} else if (wheelchair === true) {

  return (
      <>
      <AccessibleHotels />
      </>
  
      );

}else if (bsl === true) {
    return (
      <>
      <BSL />
      </>
    )
}

};
export default Home;