import React , { useState } from 'react';
import Header from '../components/Header';
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
  <Header />
    <div className='title'>
    <h2>Your travel app for accessible holidays</h2>
    <img onClick = { () => {setWheelchair(true)} } className="images" src={Wheelchair} alt='wheelchairimg' width="500" height="500"/>
    <img onClick = { () => {setBsl(true)} } className="images" src={Sign} alt='signimg' width="500" height="500"/>
    </div>
  </>

  );

} else if (wheelchair === true) {

  return (
      <>
      <Header />
      {/* <Button variant="light" onClick = { setWheelchair(false) }>Wheelchair to go to hotels</Button>  */}
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