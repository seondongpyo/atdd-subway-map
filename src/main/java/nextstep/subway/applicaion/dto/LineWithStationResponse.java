package nextstep.subway.applicaion.dto;

import java.time.LocalDateTime;
import java.util.List;

public class LineWithStationResponse {
  private Long id;
  private String name;
  private String color;
  private LocalDateTime createdDate;
  private LocalDateTime modifiedDate;
  private List<StationResponse> stations;

  public LineWithStationResponse(Long id, String name, String color, LocalDateTime createdDate, LocalDateTime modifiedDate, List<StationResponse> stations) {
    this.id = id;
    this.name = name;
    this.color = color;
    this.createdDate = createdDate;
    this.modifiedDate = modifiedDate;
    this.stations = stations;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public LocalDateTime getModifiedDate() {
    return modifiedDate;
  }

  public List<StationResponse> getStations() {
    return stations;
  }
}
