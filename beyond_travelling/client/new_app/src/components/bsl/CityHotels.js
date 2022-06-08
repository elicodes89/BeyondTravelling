import React, { useState , useEffect } from 'react';
import Button from 'react-bootstrap/Button';
import './BSL.css';

const CityHotels = (props) => {
  const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;
// we declare the variable here so it is globally readable
// initial state of videoExists will be false
let videoExists = false;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <Button variant="white" onClick = {() => onCityClick(cityHotel) }><span className = "hotelName">{cityHotel.hotel_name}</span><br/><img src={cityHotel.img2} alt= "hotel_collage" height = "550px" width = "550px" /></Button>

  })


  // we can add more functionality to this function
  const onCityClick = function(cityHotel){
    setSelectedCityHotel(cityHotel);

}
useEffect(() => {
  // this use effect will run after the second time it runs the function. useefects runs 2 times for better performance. if length of array is 0...
if (selectedCityHotel != null){
  if (selectedCityHotel.videos.length > 0){
    videoExists = true;

  }
}
},[selectedCityHotel]);

  if (selectedCity != undefined && selectedCityHotel === null) {
    return (
      <>
      <p>{cityHotelsList}</p>
      </>
    )  
} else if(selectedCityHotel != null){
  return (
    <div className = "container">
    <div className = "flex-child row">
    <div className = "col">
    <h2>{selectedCityHotel.hotel_name}</h2> 
    <li className = "bookingLink"><a href= {selectedCityHotel.website} target="_blank">Click here to make a booking</a></li>

    <img src= {selectedCityHotel.img} alt="hotelimg" height = "550px" width="600px"/>
    <div className = "hotelDetails">
    <li className = "boldText">Contact Number: <span className="noBoldText">{selectedCityHotel.contact_number}</span></li>
    <li className = "boldText">Address: <span className="noBoldText">{selectedCityHotel.address}</span></li>
    <br/>
    <h4>Some perks about this hotel:</h4>
    <div className='textToAlign'>
    <li>{selectedCityHotel.comments[0].name}</li>
    <li>{selectedCityHotel.comments[1].name}</li>
    <li>{selectedCityHotel.comments[2].name}</li>
    <li>{selectedCityHotel.comments[3].name}</li>
    </div>
    </div>
    </div>
    <br/>
    </div>
    <div className = "flex-child row2">
    <div className = "hotel_video">
      {/* if videosExists does not exists then...  */}
    {!videoExists && selectedCityHotel.videos[0] != undefined ? <iframe width="560" height="315" src={selectedCityHotel.videos[0].name} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> : null}
    <br/>
    {!videoExists && selectedCityHotel.videos[1] != undefined ? <iframe width="560" height="315" src={selectedCityHotel.videos[1].name} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> : null}
    {/* <Button variant="light" onClick = { () => {} }>GO BACK</Button> */}
    </div>
    </div>
  </div>
  )  
} else {
  return (
    <>
    <h1>Oops. Try Again</h1>
    </>
  );
};
};


export default CityHotels;