import React, { useState , useEffect } from 'react';
import Button from 'react-bootstrap/Button';

const CityHotels = (props) => {
  const [selectedCityHotel, setSelectedCityHotel] = useState(null);
const selectedCity = props.selectedCity;
const cityHotels = selectedCity.hotels;
// we declare the variable here so it is globally readable
// initial state of videoExists will be false
let videoExists = false;

  const cityHotelsList = cityHotels.map((cityHotel, index) => {
    return <Button variant="white" onClick = {() => onCityClick(cityHotel) }><span className = "hotelName">{cityHotel.hotel_name}</span><br/><img src={cityHotel.img2} alt= "hotel_collage" width = "600px" /></Button>

  })

  function task(){
    console.log(cityHotelsList)
  }
  setTimeout(task, 1000);


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
  <div className = "row">
    <div className = "col-6">
    <h2>{selectedCityHotel.hotel_name}</h2> 
    <img src= {selectedCityHotel.img} alt="hotelimg" height = "550px" width="600px"/>
    <li><a href= {selectedCityHotel.website} target="_blank">Click here to make a booking</a></li>
    <li>Contact Number: {selectedCityHotel.contact_number}</li>
    <li>Address: {selectedCityHotel.address}</li>
    <br/>
    <div className="hotel_description">
    <h4>Some perks about this hotel:</h4>
    <li>{selectedCityHotel.comments[0].name}</li>
    <li>{selectedCityHotel.comments[1].name}</li>
    <li>{selectedCityHotel.comments[2].name}</li>
    <li>{selectedCityHotel.comments[3].name}</li>
    </div>
    <br/>
    <div className = "col-6">
    <div className = "hotel_video">
      {/* if videosExists does not exists then...  */}
    {!videoExists && selectedCityHotel.videos[1] != undefined ? <iframe width="560" height="315" src={selectedCityHotel.videos[1].name} title="Video" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> : null}
    </div>
    </div>
  </div>
  </div>
  )  
} else {
  return (
    <>
    <h1>Oops. Try Again!!</h1>
    </>
  );
};
};


export default CityHotels;